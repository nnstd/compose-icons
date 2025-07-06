package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChatSleep: ImageVector
    get() {
        if (_ChatSleep != null) {
            return _ChatSleep!!
        }
        _ChatSleep = ImageVector.Builder(
            name = "ChatSleep",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(6.5f, 3f, 2f, 6.58f, 2f, 11f)
                curveTo(2f, 13.13f, 3.05f, 15.07f, 4.75f, 16.5f)
                curveTo(4.7f, 17.1f, 4.33f, 18.67f, 2f, 21f)
                curveTo(2f, 21f, 5.55f, 21f, 8.47f, 18.5f)
                curveTo(9.57f, 18.82f, 10.76f, 19f, 12f, 19f)
                curveTo(17.5f, 19f, 22f, 15.42f, 22f, 11f)
                reflectiveCurveTo(17.5f, 3f, 12f, 3f)
                moveTo(15f, 9.3f)
                lineTo(11.76f, 13f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(12.7f)
                lineTo(12.24f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(9.3f)
                close()
            }
        }.build()

        return _ChatSleep!!
    }

@Suppress("ObjectPropertyName")
private var _ChatSleep: ImageVector? = null
