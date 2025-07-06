package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NintendoWiiu: ImageVector
    get() {
        if (_NintendoWiiu != null) {
            return _NintendoWiiu!!
        }
        _NintendoWiiu = ImageVector.Builder(
            name = "NintendoWiiu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 15.96f)
                curveTo(2f, 18.19f, 3.54f, 19.5f, 5.79f, 19.5f)
                horizontalLineTo(18.57f)
                curveTo(20.47f, 19.5f, 22f, 18.2f, 22f, 16.32f)
                verticalLineTo(6.97f)
                curveTo(22f, 5.83f, 21.15f, 4.6f, 20.11f, 4.6f)
                horizontalLineTo(17.15f)
                verticalLineTo(12.3f)
                curveTo(17.15f, 18.14f, 6.97f, 18.09f, 6.97f, 12.41f)
                verticalLineTo(4.5f)
                horizontalLineTo(4.72f)
                curveTo(3.26f, 4.5f, 2f, 5.41f, 2f, 6.85f)
                verticalLineTo(15.96f)
                moveTo(9.34f, 11.23f)
                curveTo(9.34f, 15.74f, 14.66f, 15.09f, 14.66f, 11.94f)
                verticalLineTo(4.5f)
                horizontalLineTo(9.34f)
                verticalLineTo(11.23f)
                close()
            }
        }.build()

        return _NintendoWiiu!!
    }

@Suppress("ObjectPropertyName")
private var _NintendoWiiu: ImageVector? = null
