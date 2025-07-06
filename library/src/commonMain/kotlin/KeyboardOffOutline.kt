package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyboardOffOutline: ImageVector
    get() {
        if (_KeyboardOffOutline != null) {
            return _KeyboardOffOutline!!
        }
        _KeyboardOffOutline = ImageVector.Builder(
            name = "KeyboardOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 4.27f)
                lineTo(2.47f, 5.74f)
                curveTo(2.18f, 6.08f, 2f, 6.5f, 2f, 7f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 19f)
                horizontalLineTo(15.73f)
                lineTo(18.73f, 22f)
                lineTo(20f, 20.72f)
                lineTo(2.28f, 3f)
                lineTo(1f, 4.27f)
                moveTo(4f, 17f)
                verticalLineTo(7.27f)
                lineTo(5f, 8.27f)
                verticalLineTo(10f)
                horizontalLineTo(6.73f)
                lineTo(8f, 11.27f)
                verticalLineTo(13f)
                horizontalLineTo(9.73f)
                lineTo(10.73f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(12.73f)
                lineTo(13.73f, 17f)
                horizontalLineTo(4f)
                moveTo(5f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                moveTo(17f, 11f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                moveTo(19f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                moveTo(14f, 11f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                horizontalLineTo(14.83f)
                lineTo(14f, 12.17f)
                verticalLineTo(11f)
                moveTo(13f, 10f)
                horizontalLineTo(11.83f)
                lineTo(11f, 9.17f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                moveTo(22f, 7f)
                verticalLineTo(17f)
                curveTo(22f, 17.86f, 21.45f, 18.58f, 20.7f, 18.87f)
                lineTo(18.83f, 17f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                horizontalLineTo(8.83f)
                lineTo(6.83f, 5f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 7f)
                moveTo(16f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _KeyboardOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardOffOutline: ImageVector? = null
