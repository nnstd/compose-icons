package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChatProcessing: ImageVector
    get() {
        if (_ChatProcessing != null) {
            return _ChatProcessing!!
        }
        _ChatProcessing = ImageVector.Builder(
            name = "ChatProcessing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(17.5f, 3f, 22f, 6.58f, 22f, 11f)
                curveTo(22f, 15.42f, 17.5f, 19f, 12f, 19f)
                curveTo(10.76f, 19f, 9.57f, 18.82f, 8.47f, 18.5f)
                curveTo(5.55f, 21f, 2f, 21f, 2f, 21f)
                curveTo(4.33f, 18.67f, 4.7f, 17.1f, 4.75f, 16.5f)
                curveTo(3.05f, 15.07f, 2f, 13.13f, 2f, 11f)
                curveTo(2f, 6.58f, 6.5f, 3f, 12f, 3f)
                moveTo(17f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(17f)
                moveTo(13f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                moveTo(9f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _ChatProcessing!!
    }

@Suppress("ObjectPropertyName")
private var _ChatProcessing: ImageVector? = null
