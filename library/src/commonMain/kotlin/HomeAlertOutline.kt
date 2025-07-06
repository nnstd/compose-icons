package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeAlertOutline: ImageVector
    get() {
        if (_HomeAlertOutline != null) {
            return _HomeAlertOutline!!
        }
        _HomeAlertOutline = ImageVector.Builder(
            name = "HomeAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5.7f)
                lineTo(17f, 10.2f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(10.2f)
                lineTo(12f, 5.7f)
                moveTo(19f, 20f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                lineTo(12f, 3f)
                lineTo(2f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                moveTo(13f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                moveTo(13f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
            }
        }.build()

        return _HomeAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HomeAlertOutline: ImageVector? = null
