package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseSync: ImageVector
    get() {
        if (_DatabaseSync != null) {
            return _DatabaseSync!!
        }
        _DatabaseSync = ImageVector.Builder(
            name = "DatabaseSync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 12f)
                verticalLineTo(13.5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 17.5f)
                curveTo(23f, 18.32f, 22.75f, 19.08f, 22.33f, 19.71f)
                lineTo(21.24f, 18.62f)
                curveTo(21.41f, 18.28f, 21.5f, 17.9f, 21.5f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 15f)
                verticalLineTo(16.5f)
                lineTo(16.75f, 14.25f)
                lineTo(19f, 12f)
                moveTo(19f, 23f)
                verticalLineTo(21.5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 17.5f)
                curveTo(15f, 16.68f, 15.25f, 15.92f, 15.67f, 15.29f)
                lineTo(16.76f, 16.38f)
                curveTo(16.59f, 16.72f, 16.5f, 17.1f, 16.5f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 20f)
                verticalLineTo(18.5f)
                lineTo(21.25f, 20.75f)
                lineTo(19f, 23f)
                moveTo(12f, 3f)
                curveTo(16.42f, 3f, 20f, 4.79f, 20f, 7f)
                curveTo(20f, 9.21f, 16.42f, 11f, 12f, 11f)
                curveTo(7.58f, 11f, 4f, 9.21f, 4f, 7f)
                curveTo(4f, 4.79f, 7.58f, 3f, 12f, 3f)
                moveTo(4f, 9f)
                curveTo(4f, 11.21f, 7.58f, 13f, 12f, 13f)
                curveTo(13.11f, 13f, 14.17f, 12.89f, 15.14f, 12.68f)
                curveTo(14.19f, 13.54f, 13.5f, 14.67f, 13.18f, 15.96f)
                lineTo(12f, 16f)
                curveTo(7.58f, 16f, 4f, 14.21f, 4f, 12f)
                verticalLineTo(9f)
                moveTo(20f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(19.5f)
                lineTo(18.9f, 11.03f)
                curveTo(19.6f, 10.43f, 20f, 9.74f, 20f, 9f)
                moveTo(4f, 14f)
                curveTo(4f, 16.21f, 7.58f, 18f, 12f, 18f)
                lineTo(13f, 17.97f)
                curveTo(13.09f, 19.03f, 13.42f, 20f, 13.95f, 20.88f)
                lineTo(12f, 21f)
                curveTo(7.58f, 21f, 4f, 19.21f, 4f, 17f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _DatabaseSync!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseSync: ImageVector? = null
