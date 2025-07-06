package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WalletMembership: ImageVector
    get() {
        if (_WalletMembership != null) {
            return _WalletMembership!!
        }
        _WalletMembership = ImageVector.Builder(
            name = "WalletMembership",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 10f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                moveTo(20f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.89f, 2f, 2f, 2.89f, 2f, 4f)
                verticalLineTo(15f)
                curveTo(2f, 16.11f, 2.89f, 17f, 4f, 17f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                lineTo(12f, 20f)
                lineTo(16f, 22f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                curveTo(21.11f, 17f, 22f, 16.11f, 22f, 15f)
                verticalLineTo(4f)
                curveTo(22f, 2.89f, 21.11f, 2f, 20f, 2f)
                close()
            }
        }.build()

        return _WalletMembership!!
    }

@Suppress("ObjectPropertyName")
private var _WalletMembership: ImageVector? = null
