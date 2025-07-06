package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NavigationOutline: ImageVector
    get() {
        if (_NavigationOutline != null) {
            return _NavigationOutline!!
        }
        _NavigationOutline = ImageVector.Builder(
            name = "NavigationOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.3f)
                lineTo(16.3f, 17.7f)
                lineTo(12.8f, 16.2f)
                lineTo(12f, 15.8f)
                lineTo(11.2f, 16.2f)
                lineTo(7.7f, 17.7f)
                lineTo(12f, 7.3f)
                moveTo(12f, 2f)
                lineTo(4.5f, 20.3f)
                lineTo(5.2f, 21f)
                lineTo(12f, 18f)
                lineTo(18.8f, 21f)
                lineTo(19.5f, 20.3f)
                lineTo(12f, 2f)
                close()
            }
        }.build()

        return _NavigationOutline!!
    }

@Suppress("ObjectPropertyName")
private var _NavigationOutline: ImageVector? = null
