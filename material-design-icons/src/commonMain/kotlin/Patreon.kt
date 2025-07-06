package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Patreon: ImageVector
    get() {
        if (_Patreon != null) {
            return _Patreon!!
        }
        _Patreon = ImageVector.Builder(
            name = "Patreon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.82f, 2.41f)
                curveTo(18.78f, 2.41f, 22f, 5.65f, 22f, 9.62f)
                curveTo(22f, 13.58f, 18.78f, 16.8f, 14.82f, 16.8f)
                curveTo(10.85f, 16.8f, 7.61f, 13.58f, 7.61f, 9.62f)
                curveTo(7.61f, 5.65f, 10.85f, 2.41f, 14.82f, 2.41f)
                moveTo(2f, 21.6f)
                horizontalLineTo(5.5f)
                verticalLineTo(2.41f)
                horizontalLineTo(2f)
                verticalLineTo(21.6f)
                close()
            }
        }.build()

        return _Patreon!!
    }

@Suppress("ObjectPropertyName")
private var _Patreon: ImageVector? = null
