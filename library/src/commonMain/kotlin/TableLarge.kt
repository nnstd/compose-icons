package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableLarge: ImageVector
    get() {
        if (_TableLarge != null) {
            return _TableLarge!!
        }
        _TableLarge = ImageVector.Builder(
            name = "TableLarge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 3f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 5f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 3f)
                moveTo(4f, 7f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                moveTo(10f, 7f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                moveTo(20f, 10f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                moveTo(4f, 12f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                moveTo(4f, 20f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                moveTo(10f, 12f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                moveTo(10f, 20f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                moveTo(20f, 20f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                moveTo(20f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _TableLarge!!
    }

@Suppress("ObjectPropertyName")
private var _TableLarge: ImageVector? = null
