package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Cancel: ImageVector
    get() {
        if (_Cancel != null) {
            return _Cancel!!
        }
        _Cancel = ImageVector.Builder(
            name = "Cancel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 22f, 12f, 22f)
                reflectiveCurveTo(2f, 17.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 2f, 12f, 2f)
                moveTo(12f, 4f)
                curveTo(10.1f, 4f, 8.4f, 4.6f, 7.1f, 5.7f)
                lineTo(18.3f, 16.9f)
                curveTo(19.3f, 15.5f, 20f, 13.8f, 20f, 12f)
                curveTo(20f, 7.6f, 16.4f, 4f, 12f, 4f)
                moveTo(16.9f, 18.3f)
                lineTo(5.7f, 7.1f)
                curveTo(4.6f, 8.4f, 4f, 10.1f, 4f, 12f)
                curveTo(4f, 16.4f, 7.6f, 20f, 12f, 20f)
                curveTo(13.9f, 20f, 15.6f, 19.4f, 16.9f, 18.3f)
                close()
            }
        }.build()

        return _Cancel!!
    }

@Suppress("ObjectPropertyName")
private var _Cancel: ImageVector? = null
