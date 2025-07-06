package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GlassTulip: ImageVector
    get() {
        if (_GlassTulip != null) {
            return _GlassTulip!!
        }
        _GlassTulip = ImageVector.Builder(
            name = "GlassTulip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 2f)
                horizontalLineTo(16f)
                curveTo(15.67f, 2.67f, 15.33f, 3.33f, 15.58f, 5f)
                curveTo(15.83f, 6.67f, 16.67f, 9.33f, 16.25f, 10.74f)
                curveTo(15.83f, 12.14f, 14.17f, 12.28f, 13.33f, 13.86f)
                curveTo(12.5f, 15.44f, 12.5f, 18.47f, 13.08f, 19.9f)
                curveTo(13.67f, 21.33f, 14.83f, 21.17f, 15.42f, 21.25f)
                curveTo(16f, 21.33f, 16f, 21.67f, 16f, 22f)
                horizontalLineTo(8f)
                curveTo(8f, 21.67f, 8f, 21.33f, 8.58f, 21.25f)
                curveTo(9.17f, 21.17f, 10.33f, 21.33f, 10.92f, 19.9f)
                curveTo(11.5f, 18.47f, 11.5f, 15.44f, 10.67f, 13.86f)
                curveTo(9.83f, 12.28f, 8.17f, 12.14f, 7.75f, 10.74f)
                curveTo(7.33f, 9.33f, 8.17f, 6.67f, 8.42f, 5f)
                curveTo(8.67f, 3.33f, 8.33f, 2.67f, 8f, 2f)
                moveTo(10f, 4f)
                curveTo(10f, 5.19f, 9.83f, 6.17f, 9.64f, 7f)
                horizontalLineTo(14.27f)
                curveTo(14.13f, 6.17f, 14f, 5.19f, 14f, 4f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _GlassTulip!!
    }

@Suppress("ObjectPropertyName")
private var _GlassTulip: ImageVector? = null
