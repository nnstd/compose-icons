package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Whistle: ImageVector
    get() {
        if (_Whistle != null) {
            return _Whistle!!
        }
        _Whistle = ImageVector.Builder(
            name = "Whistle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 9f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 15.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 22f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 15.5f)
                verticalLineTo(13.91f)
                lineTo(22f, 12f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(8.5f)
                moveTo(11f, 2f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                horizontalLineTo(11f)
                moveTo(6.35f, 7.28f)
                curveTo(5.68f, 7.44f, 5.04f, 7.68f, 4.43f, 8f)
                lineTo(2.14f, 4.88f)
                lineTo(3.76f, 3.7f)
                lineTo(6.35f, 7.28f)
                moveTo(17.86f, 4.88f)
                lineTo(16.32f, 7f)
                horizontalLineTo(13.85f)
                lineTo(16.24f, 3.7f)
                lineTo(17.86f, 4.88f)
                close()
            }
        }.build()

        return _Whistle!!
    }

@Suppress("ObjectPropertyName")
private var _Whistle: ImageVector? = null
