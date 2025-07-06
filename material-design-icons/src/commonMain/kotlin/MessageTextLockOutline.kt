package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageTextLockOutline: ImageVector
    get() {
        if (_MessageTextLockOutline != null) {
            return _MessageTextLockOutline!!
        }
        _MessageTextLockOutline = ImageVector.Builder(
            name = "MessageTextLockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 3f)
                verticalLineTo(2.5f)
                curveTo(23f, 1.12f, 21.88f, 0f, 20.5f, 0f)
                reflectiveCurveTo(18f, 1.12f, 18f, 2.5f)
                verticalLineTo(3f)
                curveTo(17.45f, 3f, 17f, 3.45f, 17f, 4f)
                verticalLineTo(8f)
                curveTo(17f, 8.55f, 17.45f, 9f, 18f, 9f)
                horizontalLineTo(23f)
                curveTo(23.55f, 9f, 24f, 8.55f, 24f, 8f)
                verticalLineTo(4f)
                curveTo(24f, 3.45f, 23.55f, 3f, 23f, 3f)
                moveTo(22f, 3f)
                horizontalLineTo(19f)
                verticalLineTo(2.5f)
                curveTo(19f, 1.67f, 19.67f, 1f, 20.5f, 1f)
                reflectiveCurveTo(22f, 1.67f, 22f, 2.5f)
                verticalLineTo(3f)
                moveTo(6f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                moveTo(6f, 7f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                moveTo(22f, 11f)
                verticalLineTo(16f)
                curveTo(22f, 17.11f, 21.11f, 18f, 20f, 18f)
                horizontalLineTo(6f)
                lineTo(2f, 22f)
                verticalLineTo(4f)
                curveTo(2f, 2.89f, 2.9f, 2f, 4f, 2f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(17.17f)
                lineTo(5.17f, 16f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _MessageTextLockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MessageTextLockOutline: ImageVector? = null
