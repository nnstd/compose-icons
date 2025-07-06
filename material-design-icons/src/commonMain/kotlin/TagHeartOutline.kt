package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TagHeartOutline: ImageVector
    get() {
        if (_TagHeartOutline != null) {
            return _TagHeartOutline!!
        }
        _TagHeartOutline = ImageVector.Builder(
            name = "TagHeartOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(11f)
                curveTo(2f, 11.55f, 2.22f, 12.05f, 2.59f, 12.42f)
                lineTo(11.59f, 21.42f)
                curveTo(11.95f, 21.78f, 12.45f, 22f, 13f, 22f)
                curveTo(13.55f, 22f, 14.05f, 21.78f, 14.41f, 21.41f)
                lineTo(21.41f, 14.41f)
                curveTo(21.78f, 14.05f, 22f, 13.55f, 22f, 13f)
                curveTo(22f, 12.45f, 21.77f, 11.94f, 21.41f, 11.58f)
                lineTo(12.41f, 2.58f)
                curveTo(12.05f, 2.22f, 11.55f, 2f, 11f, 2f)
                horizontalLineTo(4f)
                verticalLineTo(2f)
                moveTo(11f, 4f)
                lineTo(20f, 13f)
                lineTo(13f, 20f)
                lineTo(4f, 11f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                moveTo(6.5f, 5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 5f)
                moveTo(10.95f, 10.5f)
                curveTo(9.82f, 10.5f, 8.9f, 11.42f, 8.9f, 12.55f)
                curveTo(8.9f, 13.12f, 9.13f, 13.62f, 9.5f, 14f)
                lineTo(13f, 17.5f)
                lineTo(16.5f, 14f)
                curveTo(16.87f, 13.63f, 17.1f, 13.11f, 17.1f, 12.55f)
                arcTo(2.05f, 2.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.05f, 10.5f)
                curveTo(14.5f, 10.5f, 13.97f, 10.73f, 13.6f, 11.1f)
                lineTo(13f, 11.7f)
                lineTo(12.4f, 11.11f)
                curveTo(12.03f, 10.73f, 11.5f, 10.5f, 10.95f, 10.5f)
                close()
            }
        }.build()

        return _TagHeartOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TagHeartOutline: ImageVector? = null
