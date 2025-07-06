package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChatPlus: ImageVector
    get() {
        if (_ChatPlus != null) {
            return _ChatPlus!!
        }
        _ChatPlus = ImageVector.Builder(
            name = "ChatPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
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
                moveTo(12f, 3f)
                curveTo(17.5f, 3f, 22f, 6.58f, 22f, 11f)
                curveTo(22f, 11.58f, 21.92f, 12.14f, 21.78f, 12.68f)
                curveTo(20.95f, 12.25f, 20f, 12f, 19f, 12f)
                curveTo(15.69f, 12f, 13f, 14.69f, 13f, 18f)
                lineTo(13.08f, 18.95f)
                lineTo(12f, 19f)
                curveTo(10.76f, 19f, 9.57f, 18.82f, 8.47f, 18.5f)
                curveTo(5.55f, 21f, 2f, 21f, 2f, 21f)
                curveTo(4.33f, 18.67f, 4.7f, 17.1f, 4.75f, 16.5f)
                curveTo(3.05f, 15.07f, 2f, 13.14f, 2f, 11f)
                curveTo(2f, 6.58f, 6.5f, 3f, 12f, 3f)
                close()
            }
        }.build()

        return _ChatPlus!!
    }

@Suppress("ObjectPropertyName")
private var _ChatPlus: ImageVector? = null
