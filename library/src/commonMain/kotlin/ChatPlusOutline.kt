package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChatPlusOutline: ImageVector
    get() {
        if (_ChatPlusOutline != null) {
            return _ChatPlusOutline!!
        }
        _ChatPlusOutline = ImageVector.Builder(
            name = "ChatPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(17.5f, 3f, 22f, 6.58f, 22f, 11f)
                curveTo(22f, 11.58f, 21.92f, 12.14f, 21.78f, 12.68f)
                curveTo(21.19f, 12.38f, 20.55f, 12.16f, 19.88f, 12.06f)
                curveTo(19.96f, 11.72f, 20f, 11.36f, 20f, 11f)
                curveTo(20f, 7.69f, 16.42f, 5f, 12f, 5f)
                curveTo(7.58f, 5f, 4f, 7.69f, 4f, 11f)
                curveTo(4f, 14.31f, 7.58f, 17f, 12f, 17f)
                lineTo(13.09f, 16.95f)
                lineTo(13f, 18f)
                lineTo(13.08f, 18.95f)
                lineTo(12f, 19f)
                curveTo(10.81f, 19f, 9.62f, 18.83f, 8.47f, 18.5f)
                curveTo(6.64f, 20f, 4.37f, 20.89f, 2f, 21f)
                curveTo(4.33f, 18.67f, 4.75f, 17.1f, 4.75f, 16.5f)
                curveTo(3.06f, 15.17f, 2.05f, 13.15f, 2f, 11f)
                curveTo(2f, 6.58f, 6.5f, 3f, 12f, 3f)
                moveTo(18f, 14f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(23f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _ChatPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ChatPlusOutline: ImageVector? = null
