package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Hololens: ImageVector
    get() {
        if (_Hololens != null) {
            return _Hololens!!
        }
        _Hololens = ImageVector.Builder(
            name = "Hololens",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8f)
                curveTo(12f, 8f, 22f, 8f, 22f, 11f)
                curveTo(22f, 11f, 22.09f, 14.36f, 21.75f, 14.25f)
                curveTo(21f, 11f, 12f, 11f, 12f, 11f)
                curveTo(12f, 11f, 3f, 11f, 2.25f, 14.25f)
                curveTo(1.91f, 14.36f, 2f, 11f, 2f, 11f)
                curveTo(2f, 8f, 12f, 8f, 12f, 8f)
                moveTo(12f, 12f)
                curveTo(20f, 12f, 20.75f, 14.25f, 20.75f, 14.25f)
                curveTo(19.75f, 17.25f, 19f, 18f, 15f, 18f)
                curveTo(12f, 18f, 13f, 16.5f, 12f, 16.5f)
                curveTo(11f, 16.5f, 12f, 18f, 9f, 18f)
                curveTo(5f, 18f, 4.25f, 17.25f, 3.25f, 14.25f)
                curveTo(3.25f, 14.25f, 4f, 12f, 12f, 12f)
                close()
            }
        }.build()

        return _Hololens!!
    }

@Suppress("ObjectPropertyName")
private var _Hololens: ImageVector? = null
