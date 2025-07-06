package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountFileTextOutline: ImageVector
    get() {
        if (_AccountFileTextOutline != null) {
            return _AccountFileTextOutline!!
        }
        _AccountFileTextOutline = ImageVector.Builder(
            name = "AccountFileTextOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 5f)
                curveTo(9.43f, 5f, 11f, 6.57f, 11f, 8.5f)
                curveTo(11f, 10.43f, 9.43f, 12f, 7.5f, 12f)
                curveTo(5.57f, 12f, 4f, 10.43f, 4f, 8.5f)
                curveTo(4f, 6.57f, 5.57f, 5f, 7.5f, 5f)
                moveTo(1f, 19f)
                verticalLineTo(16.5f)
                curveTo(1f, 14.57f, 4.46f, 13f, 7.5f, 13f)
                curveTo(8.68f, 13f, 9.92f, 13.24f, 11f, 13.64f)
                verticalLineTo(15.56f)
                curveTo(10.18f, 15.22f, 8.91f, 15f, 7.5f, 15f)
                curveTo(5f, 15f, 3f, 15.67f, 3f, 16.5f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(1f)
                moveTo(22f, 19f)
                horizontalLineTo(14f)
                curveTo(13.45f, 19f, 13f, 18.55f, 13f, 18f)
                verticalLineTo(6f)
                curveTo(13f, 5.45f, 13.45f, 5f, 14f, 5f)
                horizontalLineTo(19f)
                lineTo(23f, 9f)
                verticalLineTo(18f)
                curveTo(23f, 18.55f, 22.55f, 19f, 22f, 19f)
                moveTo(15f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                moveTo(7.5f, 7f)
                curveTo(6.67f, 7f, 6f, 7.67f, 6f, 8.5f)
                curveTo(6f, 9.33f, 6.67f, 10f, 7.5f, 10f)
                curveTo(8.33f, 10f, 9f, 9.33f, 9f, 8.5f)
                curveTo(9f, 7.67f, 8.33f, 7f, 7.5f, 7f)
                moveTo(16f, 13f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _AccountFileTextOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountFileTextOutline: ImageVector? = null
