package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HelpNetworkOutline: ImageVector
    get() {
        if (_HelpNetworkOutline != null) {
            return _HelpNetworkOutline!!
        }
        _HelpNetworkOutline = ImageVector.Builder(
            name = "HelpNetworkOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 15f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 3f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 23f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                moveTo(7f, 15f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                moveTo(11.95f, 6f)
                curveTo(11.17f, 6f, 10.55f, 6.18f, 10.07f, 6.5f)
                curveTo(9.61f, 6.89f, 9.38f, 7.4f, 9.39f, 8.1f)
                lineTo(9.4f, 8.13f)
                horizontalLineTo(11.11f)
                curveTo(11.12f, 7.86f, 11.2f, 7.65f, 11.36f, 7.5f)
                curveTo(11.5f, 7.38f, 11.72f, 7.31f, 11.95f, 7.31f)
                curveTo(12.22f, 7.31f, 12.45f, 7.4f, 12.61f, 7.56f)
                curveTo(12.77f, 7.73f, 12.85f, 7.96f, 12.85f, 8.22f)
                curveTo(12.85f, 8.5f, 12.78f, 8.75f, 12.64f, 8.95f)
                curveTo(12.5f, 9.16f, 12.33f, 9.33f, 12.1f, 9.5f)
                curveTo(11.65f, 9.78f, 11.34f, 10.05f, 11.17f, 10.29f)
                curveTo(11f, 10.5f, 10.89f, 10.89f, 10.89f, 11.33f)
                horizontalLineTo(12.67f)
                curveTo(12.67f, 11.06f, 12.7f, 10.84f, 12.78f, 10.68f)
                curveTo(12.86f, 10.5f, 13f, 10.36f, 13.24f, 10.21f)
                curveTo(13.64f, 10f, 13.97f, 9.74f, 14.22f, 9.39f)
                curveTo(14.5f, 9.03f, 14.62f, 8.67f, 14.62f, 8.22f)
                curveTo(14.62f, 7.55f, 14.38f, 7f, 13.9f, 6.61f)
                curveTo(13.42f, 6.2f, 12.77f, 6f, 11.95f, 6f)
                moveTo(10.89f, 12.22f)
                verticalLineTo(14f)
                horizontalLineTo(12.67f)
                verticalLineTo(12.22f)
                horizontalLineTo(10.89f)
                close()
            }
        }.build()

        return _HelpNetworkOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HelpNetworkOutline: ImageVector? = null
