package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneAlert: ImageVector
    get() {
        if (_PhoneAlert != null) {
            return _PhoneAlert!!
        }
        _PhoneAlert = ImageVector.Builder(
            name = "PhoneAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.62f, 10.79f)
                curveTo(8.06f, 13.62f, 10.38f, 15.94f, 13.21f, 17.38f)
                lineTo(15.41f, 15.18f)
                curveTo(15.69f, 14.9f, 16.08f, 14.82f, 16.43f, 14.93f)
                curveTo(17.55f, 15.3f, 18.75f, 15.5f, 20f, 15.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 16.5f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 21f)
                arcTo(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 4f)
                curveTo(3f, 3.44f, 3.45f, 3f, 4f, 3f)
                horizontalLineTo(7.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 4f)
                curveTo(8.5f, 5.24f, 8.7f, 6.45f, 9.07f, 7.57f)
                curveTo(9.18f, 7.92f, 9.1f, 8.31f, 8.82f, 8.58f)
                lineTo(6.62f, 10.79f)
                moveTo(17f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(17f)
                moveTo(17f, 8f)
                verticalLineTo(2f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _PhoneAlert!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneAlert: ImageVector? = null
