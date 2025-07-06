package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailSyncOutline: ImageVector
    get() {
        if (_EmailSyncOutline != null) {
            return _EmailSyncOutline!!
        }
        _EmailSyncOutline = ImageVector.Builder(
            name = "EmailSyncOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                curveTo(1.9f, 4f, 1f, 4.9f, 1f, 6f)
                verticalLineTo(18f)
                curveTo(1f, 19.1f, 1.9f, 20f, 3f, 20f)
                horizontalLineTo(13.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 18f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                lineTo(11f, 13f)
                lineTo(19f, 8f)
                verticalLineTo(11f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 11f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 11.18f)
                verticalLineTo(6f)
                curveTo(21f, 4.9f, 20.1f, 4f, 19f, 4f)
                horizontalLineTo(3f)
                moveTo(3f, 6f)
                horizontalLineTo(19f)
                lineTo(11f, 11f)
                lineTo(3f, 6f)
                moveTo(19f, 12f)
                lineTo(16.75f, 14.25f)
                lineTo(19f, 16.5f)
                verticalLineTo(15f)
                curveTo(20.38f, 15f, 21.5f, 16.12f, 21.5f, 17.5f)
                curveTo(21.5f, 17.9f, 21.41f, 18.28f, 21.24f, 18.62f)
                lineTo(22.33f, 19.71f)
                curveTo(22.75f, 19.08f, 23f, 18.32f, 23f, 17.5f)
                curveTo(23f, 15.29f, 21.21f, 13.5f, 19f, 13.5f)
                verticalLineTo(12f)
                moveTo(15.67f, 15.29f)
                curveTo(15.25f, 15.92f, 15f, 16.68f, 15f, 17.5f)
                curveTo(15f, 19.71f, 16.79f, 21.5f, 19f, 21.5f)
                verticalLineTo(23f)
                lineTo(21.25f, 20.75f)
                lineTo(19f, 18.5f)
                verticalLineTo(20f)
                curveTo(17.62f, 20f, 16.5f, 18.88f, 16.5f, 17.5f)
                curveTo(16.5f, 17.1f, 16.59f, 16.72f, 16.76f, 16.38f)
                lineTo(15.67f, 15.29f)
                close()
            }
        }.build()

        return _EmailSyncOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmailSyncOutline: ImageVector? = null
