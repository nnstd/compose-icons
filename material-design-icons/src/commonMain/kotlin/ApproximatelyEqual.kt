package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ApproximatelyEqual: ImageVector
    get() {
        if (_ApproximatelyEqual != null) {
            return _ApproximatelyEqual!!
        }
        _ApproximatelyEqual = ImageVector.Builder(
            name = "ApproximatelyEqual",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.9f, 9.2f)
                curveTo(18.1f, 10.1f, 16.6f, 11f, 15f, 11f)
                curveTo(13.5f, 11f, 12.6f, 10.5f, 11.8f, 10.1f)
                curveTo(11f, 9.8f, 10.2f, 9.3f, 8.9f, 9.3f)
                curveTo(7.7f, 9.3f, 6.6f, 10f, 6f, 10.6f)
                lineTo(5f, 9.1f)
                curveTo(5.9f, 8.2f, 7.3f, 7.2f, 8.9f, 7.2f)
                curveTo(10.4f, 7.2f, 11.3f, 7.8f, 12.1f, 8.1f)
                curveTo(12.9f, 8.4f, 13.7f, 9f, 15f, 9f)
                curveTo(16.2f, 9f, 17.3f, 8.2f, 17.9f, 7.6f)
                lineTo(18.9f, 9.2f)
                moveTo(19f, 14.1f)
                curveTo(18.1f, 15f, 16.7f, 16f, 15.1f, 16f)
                curveTo(13.6f, 16f, 12.7f, 15.5f, 11.9f, 15.1f)
                curveTo(11.1f, 14.8f, 10.3f, 14.2f, 9f, 14.2f)
                curveTo(7.8f, 14.2f, 6.7f, 15f, 6.1f, 15.6f)
                lineTo(5.1f, 14f)
                curveTo(6f, 13.1f, 7.4f, 12.1f, 9f, 12.1f)
                curveTo(10.5f, 12.1f, 11.4f, 12.6f, 12.2f, 13f)
                curveTo(13f, 13.3f, 13.8f, 13.8f, 15.1f, 13.8f)
                curveTo(16.3f, 13.8f, 17.4f, 13f, 18f, 12.4f)
                lineTo(19f, 14.1f)
                close()
            }
        }.build()

        return _ApproximatelyEqual!!
    }

@Suppress("ObjectPropertyName")
private var _ApproximatelyEqual: ImageVector? = null
