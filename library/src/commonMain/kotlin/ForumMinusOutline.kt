package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ForumMinusOutline: ImageVector
    get() {
        if (_ForumMinusOutline != null) {
            return _ForumMinusOutline!!
        }
        _ForumMinusOutline = ImageVector.Builder(
            name = "ForumMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 6f)
                horizontalLineTo(19f)
                verticalLineTo(12.1f)
                curveTo(20.2f, 12.3f, 21.2f, 12.8f, 22f, 13.5f)
                verticalLineTo(7f)
                curveTo(22f, 6.5f, 21.5f, 6f, 21f, 6f)
                moveTo(6f, 17f)
                curveTo(6f, 17.5f, 6.5f, 18f, 7f, 18f)
                horizontalLineTo(12f)
                curveTo(12f, 16.9f, 12.3f, 15.9f, 12.8f, 15f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                moveTo(16f, 2f)
                horizontalLineTo(3f)
                curveTo(2.5f, 2f, 2f, 2.5f, 2f, 3f)
                verticalLineTo(17f)
                lineTo(6f, 13f)
                horizontalLineTo(14.7f)
                curveTo(15.4f, 12.5f, 16.2f, 12.2f, 17f, 12.1f)
                verticalLineTo(3f)
                curveTo(17f, 2.5f, 16.5f, 2f, 16f, 2f)
                moveTo(15f, 11f)
                horizontalLineTo(5.2f)
                lineTo(4f, 12.2f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                moveTo(22f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _ForumMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ForumMinusOutline: ImageVector? = null
