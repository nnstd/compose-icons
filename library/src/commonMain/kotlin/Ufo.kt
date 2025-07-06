package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ufo: ImageVector
    get() {
        if (_Ufo != null) {
            return _Ufo!!
        }
        _Ufo = ImageVector.Builder(
            name = "Ufo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.94f, 10.28f)
                curveTo(15.66f, 7.87f, 14f, 6f, 12f, 6f)
                reflectiveCurveTo(8.34f, 7.87f, 8.06f, 10.28f)
                curveTo(4.5f, 10.82f, 2f, 12.06f, 2f, 13.5f)
                curveTo(2f, 15.43f, 6.5f, 17f, 12f, 17f)
                reflectiveCurveTo(22f, 15.43f, 22f, 13.5f)
                curveTo(22f, 12.06f, 19.5f, 10.82f, 15.94f, 10.28f)
                close()
            }
        }.build()

        return _Ufo!!
    }

@Suppress("ObjectPropertyName")
private var _Ufo: ImageVector? = null
