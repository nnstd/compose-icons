package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CapsLock: ImageVector
    get() {
        if (_CapsLock != null) {
            return _CapsLock!!
        }
        _CapsLock = ImageVector.Builder(
            name = "CapsLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.96f, 13.71f)
                lineTo(12f, 8.29f)
                lineTo(14.03f, 13.72f)
                moveTo(11.14f, 6f)
                lineTo(6.43f, 18f)
                horizontalLineTo(8.36f)
                lineTo(9.32f, 15.43f)
                horizontalLineTo(14.68f)
                lineTo(15.64f, 18f)
                horizontalLineTo(17.57f)
                lineTo(12.86f, 6f)
                horizontalLineTo(11.14f)
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.89f, 2f, 2f, 2.89f, 2f, 4f)
                verticalLineTo(20f)
                curveTo(2f, 21.11f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(21.11f, 22f, 22f, 21.11f, 22f, 20f)
                verticalLineTo(4f)
                curveTo(22f, 2.89f, 21.1f, 2f, 20f, 2f)
                moveTo(20f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _CapsLock!!
    }

@Suppress("ObjectPropertyName")
private var _CapsLock: ImageVector? = null
