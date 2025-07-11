package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeAutomation: ImageVector
    get() {
        if (_HomeAutomation != null) {
            return _HomeAutomation!!
        }
        _HomeAutomation = ImageVector.Builder(
            name = "HomeAutomation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                lineTo(2f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                lineTo(12f, 3f)
                moveTo(12f, 8.5f)
                curveTo(14.34f, 8.5f, 16.46f, 9.43f, 18f, 10.94f)
                lineTo(16.8f, 12.12f)
                curveTo(15.58f, 10.91f, 13.88f, 10.17f, 12f, 10.17f)
                curveTo(10.12f, 10.17f, 8.42f, 10.91f, 7.2f, 12.12f)
                lineTo(6f, 10.94f)
                curveTo(7.54f, 9.43f, 9.66f, 8.5f, 12f, 8.5f)
                moveTo(12f, 11.83f)
                curveTo(13.4f, 11.83f, 14.67f, 12.39f, 15.6f, 13.3f)
                lineTo(14.4f, 14.47f)
                curveTo(13.79f, 13.87f, 12.94f, 13.5f, 12f, 13.5f)
                curveTo(11.06f, 13.5f, 10.21f, 13.87f, 9.6f, 14.47f)
                lineTo(8.4f, 13.3f)
                curveTo(9.33f, 12.39f, 10.6f, 11.83f, 12f, 11.83f)
                moveTo(12f, 15.17f)
                curveTo(12.94f, 15.17f, 13.7f, 15.91f, 13.7f, 16.83f)
                curveTo(13.7f, 17.75f, 12.94f, 18.5f, 12f, 18.5f)
                curveTo(11.06f, 18.5f, 10.3f, 17.75f, 10.3f, 16.83f)
                curveTo(10.3f, 15.91f, 11.06f, 15.17f, 12f, 15.17f)
                close()
            }
        }.build()

        return _HomeAutomation!!
    }

@Suppress("ObjectPropertyName")
private var _HomeAutomation: ImageVector? = null
