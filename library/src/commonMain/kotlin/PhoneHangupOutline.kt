package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneHangupOutline: ImageVector
    get() {
        if (_PhoneHangupOutline != null) {
            return _PhoneHangupOutline!!
        }
        _PhoneHangupOutline = ImageVector.Builder(
            name = "PhoneHangupOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 11.67f)
                arcTo(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, 11.67f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12.38f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, 13.08f)
                lineTo(2.77f, 15.56f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 15.85f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.18f, 15.57f)
                arcTo(11.5f, 11.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.84f, 13.72f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.4f, 12.82f)
                verticalLineTo(9.72f)
                arcTo(14.91f, 14.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                arcTo(14.5f, 14.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.59f, 9.73f)
                verticalLineTo(12.83f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.15f, 13.73f)
                arcTo(11.27f, 11.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.82f, 15.58f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 15.86f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.23f, 15.57f)
                lineTo(23.71f, 13.09f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.71f, 11.67f)
                moveTo(5.4f, 12.22f)
                arcTo(13.68f, 13.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.53f, 13.5f)
                lineTo(2.46f, 12.42f)
                arcTo(15.54f, 15.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.4f, 10.5f)
                moveTo(20.5f, 13.5f)
                arcTo(13.75f, 13.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.6f, 12.23f)
                verticalLineTo(10.53f)
                arcTo(14.26f, 14.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.55f, 12.43f)
                close()
            }
        }.build()

        return _PhoneHangupOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneHangupOutline: ImageVector? = null
