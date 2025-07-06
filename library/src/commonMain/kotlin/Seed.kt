package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Seed: ImageVector
    get() {
        if (_Seed != null) {
            return _Seed!!
        }
        _Seed = ImageVector.Builder(
            name = "Seed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.7f, 3.3f)
                curveTo(20.7f, 3.3f, 19.3f, 3f, 17.2f, 3f)
                curveTo(11.7f, 3f, 1.6f, 5.1f, 3.2f, 20.8f)
                curveTo(4.3f, 20.9f, 5.4f, 21f, 6.4f, 21f)
                curveTo(24.3f, 21f, 20.7f, 3.3f, 20.7f, 3.3f)
                moveTo(7f, 17f)
                curveTo(7f, 17f, 7f, 7f, 17f, 7f)
                curveTo(17f, 7f, 11f, 9f, 7f, 17f)
                close()
            }
        }.build()

        return _Seed!!
    }

@Suppress("ObjectPropertyName")
private var _Seed: ImageVector? = null
