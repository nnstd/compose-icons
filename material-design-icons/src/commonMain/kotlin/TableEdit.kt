package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableEdit: ImageVector
    get() {
        if (_TableEdit != null) {
            return _TableEdit!!
        }
        _TableEdit = ImageVector.Builder(
            name = "TableEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.7f, 13.35f)
                lineTo(20.7f, 14.35f)
                lineTo(18.65f, 12.3f)
                lineTo(19.65f, 11.3f)
                curveTo(19.86f, 11.08f, 20.21f, 11.08f, 20.42f, 11.3f)
                lineTo(21.7f, 12.58f)
                curveTo(21.92f, 12.79f, 21.92f, 13.14f, 21.7f, 13.35f)
                moveTo(12f, 18.94f)
                lineTo(18.07f, 12.88f)
                lineTo(20.12f, 14.93f)
                lineTo(14.06f, 21f)
                horizontalLineTo(12f)
                verticalLineTo(18.94f)
                moveTo(4f, 2f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 4f)
                verticalLineTo(8.17f)
                lineTo(16.17f, 12f)
                horizontalLineTo(12f)
                verticalLineTo(16.17f)
                lineTo(10.17f, 18f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 16f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 2f)
                moveTo(4f, 6f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                moveTo(12f, 6f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                moveTo(4f, 12f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _TableEdit!!
    }

@Suppress("ObjectPropertyName")
private var _TableEdit: ImageVector? = null
