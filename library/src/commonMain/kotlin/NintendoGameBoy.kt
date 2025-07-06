package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NintendoGameBoy: ImageVector
    get() {
        if (_NintendoGameBoy != null) {
            return _NintendoGameBoy!!
        }
        _NintendoGameBoy = ImageVector.Builder(
            name = "NintendoGameBoy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 1f)
                curveTo(5.9f, 1f, 5f, 1.9f, 5f, 3f)
                verticalLineTo(21f)
                curveTo(5f, 22.11f, 5.9f, 23f, 7f, 23f)
                horizontalLineTo(14f)
                curveTo(16.76f, 23f, 19f, 20.76f, 19f, 18f)
                verticalLineTo(3f)
                curveTo(19f, 1.9f, 18.11f, 1f, 17f, 1f)
                horizontalLineTo(7f)
                moveTo(8f, 4f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                moveTo(9f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                moveTo(16f, 15f)
                curveTo(16.55f, 15f, 17f, 15.45f, 17f, 16f)
                curveTo(17f, 16.55f, 16.55f, 17f, 16f, 17f)
                curveTo(15.45f, 17f, 15f, 16.55f, 15f, 16f)
                curveTo(15f, 15.45f, 15.45f, 15f, 16f, 15f)
                moveTo(14f, 17f)
                curveTo(14.55f, 17f, 15f, 17.45f, 15f, 18f)
                curveTo(15f, 18.55f, 14.55f, 19f, 14f, 19f)
                curveTo(13.45f, 19f, 13f, 18.55f, 13f, 18f)
                curveTo(13f, 17.45f, 13.45f, 17f, 14f, 17f)
                close()
            }
        }.build()

        return _NintendoGameBoy!!
    }

@Suppress("ObjectPropertyName")
private var _NintendoGameBoy: ImageVector? = null
