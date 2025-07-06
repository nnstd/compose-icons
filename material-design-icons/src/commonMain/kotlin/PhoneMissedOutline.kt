package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneMissedOutline: ImageVector
    get() {
        if (_PhoneMissedOutline != null) {
            return _PhoneMissedOutline!!
        }
        _PhoneMissedOutline = ImageVector.Builder(
            name = "PhoneMissedOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.6f, 15.5f)
                verticalLineToRelative(1.8f)
                curveToRelative(0.7f, 0.4f, 1.3f, 0.8f, 1.9f, 1.3f)
                lineToRelative(1.1f, -1.1f)
                curveToRelative(-0.9f, -0.9f, -1.9f, -1.5f, -3f, -2f)
                moveToRelative(-13.2f, 0f)
                curveToRelative(-1f, 0.5f, -2f, 1.1f, -2.9f, 1.9f)
                lineToRelative(1.1f, 1.1f)
                curveToRelative(0.6f, -0.5f, 1.2f, -0.9f, 1.9f, -1.3f)
                verticalLineToRelative(-1.7f)
                moveTo(12f, 12f)
                curveToRelative(4.5f, 0f, 8.7f, 1.7f, 11.7f, 4.7f)
                curveToRelative(0.2f, 0.2f, 0.3f, 0.4f, 0.3f, 0.7f)
                curveToRelative(0f, 0.3f, -0.1f, 0.5f, -0.3f, 0.7f)
                lineToRelative(-2.5f, 2.5f)
                curveToRelative(-0.2f, 0.2f, -0.4f, 0.3f, -0.7f, 0.3f)
                curveToRelative(-0.2f, 0f, -0.5f, -0.1f, -0.7f, -0.3f)
                curveToRelative(-0.8f, -0.7f, -1.7f, -1.4f, -2.7f, -1.8f)
                curveToRelative(-0.3f, -0.2f, -0.6f, -0.5f, -0.6f, -0.9f)
                verticalLineToRelative(-3.1f)
                curveToRelative(-1.5f, -0.5f, -3f, -0.7f, -4.6f, -0.7f)
                curveToRelative(-1.6f, 0f, -3.1f, 0.2f, -4.6f, 0.7f)
                verticalLineToRelative(3.1f)
                curveToRelative(0f, 0.4f, -0.2f, 0.7f, -0.6f, 0.9f)
                curveToRelative(-1f, 0.5f, -1.9f, 1.1f, -2.7f, 1.8f)
                curveToRelative(-0.2f, 0.2f, -0.4f, 0.3f, -0.7f, 0.3f)
                curveToRelative(-0.3f, 0f, -0.5f, -0.1f, -0.7f, -0.3f)
                lineTo(0.1f, 18.1f)
                curveToRelative(0f, -0.2f, -0.1f, -0.5f, -0.1f, -0.7f)
                curveToRelative(0f, -0.3f, 0.1f, -0.5f, 0.3f, -0.7f)
                curveTo(3.3f, 13.8f, 7.5f, 12f, 12f, 12f)
                close()
                moveTo(6.5f, 5.5f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(7.5f)
                lineTo(12f, 9f)
                lineToRelative(6f, -6f)
                lineToRelative(1f, 1f)
                lineToRelative(-7f, 7f)
                lineToRelative(-5.5f, -5.5f)
                close()
            }
        }.build()

        return _PhoneMissedOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneMissedOutline: ImageVector? = null
