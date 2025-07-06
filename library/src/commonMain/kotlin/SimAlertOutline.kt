package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SimAlertOutline: ImageVector
    get() {
        if (_SimAlertOutline != null) {
            return _SimAlertOutline!!
        }
        _SimAlertOutline = ImageVector.Builder(
            name = "SimAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                moveTo(13f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                moveTo(18f, 4f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(8.8f)
                lineTo(10.8f, 4f)
                horizontalLineTo(18f)
                moveTo(18f, 2f)
                horizontalLineTo(10f)
                lineTo(4f, 8f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.9f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.1f, 22f, 20f, 21.1f, 20f, 20f)
                verticalLineTo(4f)
                curveTo(20f, 2.9f, 19.1f, 2f, 18f, 2f)
                close()
            }
        }.build()

        return _SimAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SimAlertOutline: ImageVector? = null
