package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardSyncOutline: ImageVector
    get() {
        if (_CreditCardSyncOutline != null) {
            return _CreditCardSyncOutline!!
        }
        _CreditCardSyncOutline = ImageVector.Builder(
            name = "CreditCardSyncOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 18f)
                verticalLineTo(12f)
                horizontalLineTo(16.05f)
                curveTo(17.05f, 11.37f, 18.23f, 11f, 19.5f, 11f)
                curveTo(20.39f, 11f, 21.23f, 11.18f, 22f, 11.5f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.1f, 4f, 20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.89f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(13.5f)
                curveTo(13.24f, 19.38f, 13.08f, 18.7f, 13.03f, 18f)
                horizontalLineTo(4f)
                moveTo(4f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                moveTo(23f, 17.5f)
                curveTo(23f, 18.32f, 22.75f, 19.08f, 22.33f, 19.71f)
                lineTo(21.24f, 18.62f)
                curveTo(21.41f, 18.28f, 21.5f, 17.9f, 21.5f, 17.5f)
                curveTo(21.5f, 16.12f, 20.38f, 15f, 19f, 15f)
                verticalLineTo(16.5f)
                lineTo(16.75f, 14.25f)
                lineTo(19f, 12f)
                verticalLineTo(13.5f)
                curveTo(21.21f, 13.5f, 23f, 15.29f, 23f, 17.5f)
                moveTo(19f, 18.5f)
                lineTo(21.25f, 20.75f)
                lineTo(19f, 23f)
                verticalLineTo(21.5f)
                curveTo(16.79f, 21.5f, 15f, 19.71f, 15f, 17.5f)
                curveTo(15f, 16.68f, 15.25f, 15.92f, 15.67f, 15.29f)
                lineTo(16.76f, 16.38f)
                curveTo(16.59f, 16.72f, 16.5f, 17.1f, 16.5f, 17.5f)
                curveTo(16.5f, 18.88f, 17.62f, 20f, 19f, 20f)
                verticalLineTo(18.5f)
                close()
            }
        }.build()

        return _CreditCardSyncOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardSyncOutline: ImageVector? = null
