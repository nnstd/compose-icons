package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ElevationDecline: ImageVector
    get() {
        if (_ElevationDecline != null) {
            return _ElevationDecline!!
        }
        _ElevationDecline = ImageVector.Builder(
            name = "ElevationDecline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(11.25f)
                lineTo(9.45f, 15f)
                lineTo(13.22f, 12.8f)
                lineTo(21f, 17.29f)
                verticalLineTo(21f)
                moveTo(3f, 8.94f)
                verticalLineTo(6.75f)
                lineTo(9.45f, 10.5f)
                lineTo(13.22f, 8.3f)
                lineTo(21f, 12.79f)
                verticalLineTo(15f)
                lineTo(13.22f, 10.5f)
                lineTo(9.45f, 12.67f)
                lineTo(3f, 8.94f)
                close()
            }
        }.build()

        return _ElevationDecline!!
    }

@Suppress("ObjectPropertyName")
private var _ElevationDecline: ImageVector? = null
