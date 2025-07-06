package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableBorder: ImageVector
    get() {
        if (_TableBorder != null) {
            return _TableBorder!!
        }
        _TableBorder = ImageVector.Builder(
            name = "TableBorder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                moveTo(15f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                moveTo(11f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                moveTo(7f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                moveTo(4f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                moveTo(19f, 4f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                lineTo(11f, 8f)
                horizontalLineTo(13f)
                lineTo(19f, 8f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                curveTo(21f, 4.89f, 20.11f, 4f, 19f, 4f)
                moveTo(5f, 14f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                moveTo(5f, 10f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                moveTo(21f, 10f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                moveTo(21f, 14f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                verticalLineTo(14f)
                moveTo(11f, 16f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                moveTo(11f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
            }
        }.build()

        return _TableBorder!!
    }

@Suppress("ObjectPropertyName")
private var _TableBorder: ImageVector? = null
