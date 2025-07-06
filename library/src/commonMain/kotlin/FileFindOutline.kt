package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileFindOutline: ImageVector
    get() {
        if (_FileFindOutline != null) {
            return _FileFindOutline!!
        }
        _FileFindOutline = ImageVector.Builder(
            name = "FileFindOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(6f, 4f)
                horizontalLineTo(13f)
                lineTo(18f, 9f)
                verticalLineTo(17.58f)
                lineTo(16.16f, 15.74f)
                curveTo(17.44f, 13.8f, 17.23f, 11.17f, 15.5f, 9.46f)
                curveTo(14.55f, 8.5f, 13.28f, 8f, 12f, 8f)
                curveTo(10.72f, 8f, 9.45f, 8.5f, 8.47f, 9.46f)
                curveTo(6.5f, 11.41f, 6.5f, 14.57f, 8.47f, 16.5f)
                curveTo(9.44f, 17.5f, 10.72f, 17.97f, 12f, 17.97f)
                curveTo(12.96f, 17.97f, 13.92f, 17.69f, 14.75f, 17.14f)
                lineTo(17.6f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                moveTo(14.11f, 15.1f)
                curveTo(13.55f, 15.66f, 12.8f, 16f, 12f, 16f)
                curveTo(11.2f, 16f, 10.45f, 15.67f, 9.89f, 15.1f)
                curveTo(9.33f, 14.54f, 9f, 13.79f, 9f, 13f)
                curveTo(9f, 12.19f, 9.32f, 11.44f, 9.89f, 10.88f)
                curveTo(10.45f, 10.31f, 11.2f, 10f, 12f, 10f)
                curveTo(12.8f, 10f, 13.55f, 10.31f, 14.11f, 10.88f)
                curveTo(14.67f, 11.44f, 15f, 12.19f, 15f, 13f)
                curveTo(15f, 13.79f, 14.68f, 14.54f, 14.11f, 15.1f)
                close()
            }
        }.build()

        return _FileFindOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileFindOutline: ImageVector? = null
