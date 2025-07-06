package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CashLock: ImageVector
    get() {
        if (_CashLock != null) {
            return _CashLock!!
        }
        _CashLock = ImageVector.Builder(
            name = "CashLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.8f, 15f)
                curveTo(22.4f, 15f, 23f, 15.6f, 23f, 16.3f)
                verticalLineTo(19.8f)
                curveTo(23f, 20.4f, 22.4f, 21f, 21.7f, 21f)
                horizontalLineTo(16.2f)
                curveTo(15.6f, 21f, 15f, 20.4f, 15f, 19.7f)
                verticalLineTo(16.2f)
                curveTo(15f, 15.6f, 15.6f, 15f, 16.2f, 15f)
                verticalLineTo(13.5f)
                curveTo(16.2f, 12.1f, 17.6f, 11f, 19f, 11f)
                curveTo(20.4f, 11f, 21.8f, 12.1f, 21.8f, 13.5f)
                verticalLineTo(15f)
                moveTo(20.5f, 15f)
                verticalLineTo(13.5f)
                curveTo(20.5f, 12.7f, 19.8f, 12.2f, 19f, 12.2f)
                curveTo(18.2f, 12.2f, 17.5f, 12.7f, 17.5f, 13.5f)
                verticalLineTo(15f)
                horizontalLineTo(20.5f)
                moveTo(2f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(9.1f)
                lineTo(19f, 9f)
                curveTo(18.18f, 9f, 17.41f, 9.2f, 16.73f, 9.54f)
                curveTo(16.28f, 9.18f, 16f, 8.62f, 16f, 8f)
                horizontalLineTo(6f)
                curveTo(6f, 9.11f, 5.11f, 10f, 4f, 10f)
                verticalLineTo(14f)
                curveTo(5.11f, 14f, 6f, 14.9f, 6f, 16f)
                horizontalLineTo(13.04f)
                lineTo(13f, 16.5f)
                verticalLineTo(18f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                moveTo(11f, 9f)
                curveTo(12.66f, 9f, 14f, 10.34f, 14f, 12f)
                curveTo(14f, 13.66f, 12.66f, 15f, 11f, 15f)
                curveTo(9.34f, 15f, 8f, 13.66f, 8f, 12f)
                curveTo(8f, 10.34f, 9.34f, 9f, 11f, 9f)
                close()
            }
        }.build()

        return _CashLock!!
    }

@Suppress("ObjectPropertyName")
private var _CashLock: ImageVector? = null
