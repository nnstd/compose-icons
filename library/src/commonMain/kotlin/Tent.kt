package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Tent: ImageVector
    get() {
        if (_Tent != null) {
            return _Tent!!
        }
        _Tent = ImageVector.Builder(
            name = "Tent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6f)
                curveTo(4f, 7.19f, 4.39f, 8.27f, 5f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                curveTo(4.39f, 3.73f, 4f, 4.81f, 4f, 6f)
                moveTo(2f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(4.76f)
                lineTo(12f, 4.78f)
                lineTo(19.24f, 19f)
                horizontalLineTo(22f)
                verticalLineTo(21f)
                horizontalLineTo(2f)
                moveTo(12f, 9.19f)
                lineTo(7f, 19f)
                horizontalLineTo(17f)
                lineTo(12f, 9.19f)
                close()
            }
        }.build()

        return _Tent!!
    }

@Suppress("ObjectPropertyName")
private var _Tent: ImageVector? = null
