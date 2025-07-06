package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RhombusMediumOutline: ImageVector
    get() {
        if (_RhombusMediumOutline != null) {
            return _RhombusMediumOutline!!
        }
        _RhombusMediumOutline = ImageVector.Builder(
            name = "RhombusMediumOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6.46f)
                curveTo(11.72f, 6.46f, 11.44f, 6.56f, 11.22f, 6.78f)
                lineTo(6.78f, 11.22f)
                curveTo(6.35f, 11.65f, 6.35f, 12.35f, 6.78f, 12.78f)
                lineTo(11.22f, 17.22f)
                curveTo(11.65f, 17.65f, 12.35f, 17.65f, 12.78f, 17.22f)
                lineTo(17.22f, 12.78f)
                curveTo(17.65f, 12.35f, 17.65f, 11.65f, 17.22f, 11.22f)
                lineTo(12.78f, 6.78f)
                curveTo(12.56f, 6.56f, 12.28f, 6.46f, 12f, 6.46f)
                moveTo(12f, 8.83f)
                lineTo(15.17f, 12f)
                lineTo(12f, 15.17f)
                lineTo(8.83f, 12f)
                lineTo(12f, 8.83f)
                close()
            }
        }.build()

        return _RhombusMediumOutline!!
    }

@Suppress("ObjectPropertyName")
private var _RhombusMediumOutline: ImageVector? = null
