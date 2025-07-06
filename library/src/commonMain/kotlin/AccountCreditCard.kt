package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountCreditCard: ImageVector
    get() {
        if (_AccountCreditCard != null) {
            return _AccountCreditCard!!
        }
        _AccountCreditCard = ImageVector.Builder(
            name = "AccountCreditCard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 12f)
                curveTo(9.2f, 12f, 11f, 10.2f, 11f, 8f)
                reflectiveCurveTo(9.2f, 4f, 7f, 4f)
                reflectiveCurveTo(3f, 5.8f, 3f, 8f)
                reflectiveCurveTo(4.8f, 12f, 7f, 12f)
                moveTo(11f, 20f)
                verticalLineTo(14.7f)
                curveTo(9.9f, 14.3f, 8.5f, 14f, 7f, 14f)
                curveTo(3.1f, 14f, 0f, 15.8f, 0f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                moveTo(22f, 4f)
                horizontalLineTo(15f)
                curveTo(13.9f, 4f, 13f, 4.9f, 13f, 6f)
                verticalLineTo(18f)
                curveTo(13f, 19.1f, 13.9f, 20f, 15f, 20f)
                horizontalLineTo(22f)
                curveTo(23.1f, 20f, 24f, 19.1f, 24f, 18f)
                verticalLineTo(6f)
                curveTo(24f, 4.9f, 23.1f, 4f, 22f, 4f)
                moveTo(18f, 18f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _AccountCreditCard!!
    }

@Suppress("ObjectPropertyName")
private var _AccountCreditCard: ImageVector? = null
