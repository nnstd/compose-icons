package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TwoFactorAuthentication: ImageVector
    get() {
        if (_TwoFactorAuthentication != null) {
            return _TwoFactorAuthentication!!
        }
        _TwoFactorAuthentication = ImageVector.Builder(
            name = "TwoFactorAuthentication",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 11f)
                verticalLineTo(9f)
                curveTo(8f, 7.89f, 7.1f, 7f, 6f, 7f)
                horizontalLineTo(2f)
                moveTo(9f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                moveTo(18f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 9f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 7f)
                horizontalLineTo(18f)
                moveTo(18f, 9f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _TwoFactorAuthentication!!
    }

@Suppress("ObjectPropertyName")
private var _TwoFactorAuthentication: ImageVector? = null
