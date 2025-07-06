package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeartHalfOutline: ImageVector
    get() {
        if (_HeartHalfOutline != null) {
            return _HeartHalfOutline!!
        }
        _HeartHalfOutline = ImageVector.Builder(
            name = "HeartHalfOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 8.5f)
                curveTo(4f, 11.2f, 6.75f, 13.87f, 11f, 17.74f)
                verticalLineTo(7.2f)
                curveTo(10.42f, 5.91f, 9f, 5f, 7.5f, 5f)
                curveTo(5.5f, 5f, 4f, 6.5f, 4f, 8.5f)
                moveTo(13f, 7.2f)
                verticalLineTo(17.74f)
                lineTo(13f, 20.44f)
                lineTo(12f, 21.35f)
                lineTo(10.55f, 20.03f)
                curveTo(5.4f, 15.36f, 2f, 12.27f, 2f, 8.5f)
                curveTo(2f, 5.41f, 4.42f, 3f, 7.5f, 3f)
                curveTo(10f, 3f, 13f, 5f, 13f, 7.2f)
                close()
            }
        }.build()

        return _HeartHalfOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HeartHalfOutline: ImageVector? = null
