package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Typewriter: ImageVector
    get() {
        if (_Typewriter != null) {
            return _Typewriter!!
        }
        _Typewriter = ImageVector.Builder(
            name = "Typewriter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 13f)
                horizontalLineTo(16f)
                curveTo(16f, 14.1f, 15.1f, 15f, 14f, 15f)
                horizontalLineTo(10f)
                curveTo(8.9f, 15f, 8f, 14.1f, 8f, 13f)
                horizontalLineTo(4f)
                lineTo(2f, 18f)
                verticalLineTo(20f)
                curveTo(2f, 21.1f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(21.1f, 22f, 22f, 21.1f, 22f, 20f)
                verticalLineTo(18f)
                moveTo(6f, 20f)
                curveTo(5.11f, 20f, 4.66f, 18.92f, 5.29f, 18.29f)
                curveTo(5.92f, 17.66f, 7f, 18.11f, 7f, 19f)
                curveTo(7f, 19.55f, 6.55f, 20f, 6f, 20f)
                moveTo(10f, 20f)
                curveTo(9.11f, 20f, 8.66f, 18.92f, 9.29f, 18.29f)
                curveTo(9.92f, 17.66f, 11f, 18.11f, 11f, 19f)
                curveTo(11f, 19.55f, 10.55f, 20f, 10f, 20f)
                moveTo(14f, 20f)
                curveTo(13.11f, 20f, 12.66f, 18.92f, 13.29f, 18.29f)
                curveTo(13.92f, 17.66f, 15f, 18.11f, 15f, 19f)
                curveTo(15f, 19.55f, 14.55f, 20f, 14f, 20f)
                moveTo(18f, 20f)
                curveTo(17.11f, 20f, 16.66f, 18.92f, 17.29f, 18.29f)
                curveTo(17.92f, 17.66f, 19f, 18.11f, 19f, 19f)
                curveTo(19f, 19.55f, 18.55f, 20f, 18f, 20f)
                moveTo(18f, 10f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                moveTo(8f, 5f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                moveTo(8f, 7f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
            }
        }.build()

        return _Typewriter!!
    }

@Suppress("ObjectPropertyName")
private var _Typewriter: ImageVector? = null
