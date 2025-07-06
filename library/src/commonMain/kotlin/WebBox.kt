package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WebBox: ImageVector
    get() {
        if (_WebBox != null) {
            return _WebBox!!
        }
        _WebBox = ImageVector.Builder(
            name = "WebBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.95f, 13.4f)
                horizontalLineTo(6.58f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.58f, 10.6f)
                horizontalLineTo(8.95f)
                arcTo(11.56f, 11.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.85f, 12f)
                arcTo(11.56f, 11.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.95f, 13.4f)
                moveTo(7.16f, 9.2f)
                horizontalLineTo(9.2f)
                arcTo(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.18f, 6.71f)
                arcTo(5.55f, 5.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.16f, 9.2f)
                moveTo(16.84f, 9.2f)
                arcTo(5.59f, 5.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.81f, 6.71f)
                arcTo(10.95f, 10.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.78f, 9.2f)
                moveTo(12f, 17.57f)
                arcTo(9.5f, 9.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.34f, 14.8f)
                horizontalLineTo(10.66f)
                arcTo(9.5f, 9.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17.57f)
                moveTo(12f, 6.42f)
                arcTo(9.53f, 9.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.66f, 9.2f)
                horizontalLineTo(13.34f)
                arcTo(9.53f, 9.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6.42f)
                moveTo(7.16f, 14.8f)
                arcTo(5.61f, 5.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.18f, 17.29f)
                arcTo(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.2f, 14.8f)
                moveTo(21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                moveTo(19f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 19f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 12f)
                moveTo(15.15f, 12f)
                arcTo(11.56f, 11.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.05f, 13.4f)
                horizontalLineTo(17.42f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.42f, 10.6f)
                horizontalLineTo(15.05f)
                arcTo(11.56f, 11.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.15f, 12f)
                moveTo(13.81f, 17.29f)
                arcTo(5.62f, 5.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.84f, 14.8f)
                horizontalLineTo(14.78f)
                arcTo(10.95f, 10.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.81f, 17.29f)
                moveTo(10.36f, 10.6f)
                arcTo(8.81f, 8.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.36f, 13.4f)
                horizontalLineTo(13.64f)
                arcTo(10.3f, 10.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.75f, 12f)
                arcTo(10.21f, 10.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.64f, 10.6f)
                close()
            }
        }.build()

        return _WebBox!!
    }

@Suppress("ObjectPropertyName")
private var _WebBox: ImageVector? = null
