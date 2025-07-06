package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BagPersonalOffOutline: ImageVector
    get() {
        if (_BagPersonalOffOutline != null) {
            return _BagPersonalOffOutline!!
        }
        _BagPersonalOffOutline = ImageVector.Builder(
            name = "BagPersonalOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 19.35f)
                lineTo(2.38f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(4.77f, 6.66f)
                curveTo(4.27f, 7.34f, 4f, 8.16f, 4f, 9f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(18.56f, 22f, 19.08f, 21.76f, 19.46f, 21.35f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20f, 19.35f)
                moveTo(6f, 9f)
                curveTo(6f, 8.69f, 6.08f, 8.38f, 6.22f, 8.11f)
                lineTo(13.11f, 15f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                horizontalLineTo(14.11f)
                lineTo(18f, 19.89f)
                verticalLineTo(20f)
                moveTo(16f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 9f)
                verticalLineTo(14.8f)
                lineTo(20f, 16.8f)
                verticalLineTo(9f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 5f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 2f)
                horizontalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 4f)
                verticalLineTo(4.8f)
                lineTo(10.2f, 7f)
                horizontalLineTo(16f)
                moveTo(10f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _BagPersonalOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BagPersonalOffOutline: ImageVector? = null
