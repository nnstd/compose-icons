package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EggOutline: ImageVector
    get() {
        if (_EggOutline != null) {
            return _EggOutline!!
        }
        _EggOutline = ImageVector.Builder(
            name = "EggOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                curveTo(14.32f, 4f, 17.5f, 10.7f, 17.5f, 14.5f)
                curveTo(17.5f, 17.53f, 15.03f, 20f, 12f, 20f)
                reflectiveCurveTo(6.5f, 17.53f, 6.5f, 14.5f)
                curveTo(6.5f, 10.7f, 9.68f, 4f, 12f, 4f)
                moveTo(12f, 2f)
                curveTo(7.86f, 2f, 4.5f, 10.36f, 4.5f, 14.5f)
                curveTo(4.5f, 18.64f, 7.86f, 22f, 12f, 22f)
                reflectiveCurveTo(19.5f, 18.64f, 19.5f, 14.5f)
                curveTo(19.5f, 10.36f, 16.14f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _EggOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EggOutline: ImageVector? = null
