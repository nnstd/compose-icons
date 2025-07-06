package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountTieOutline: ImageVector
    get() {
        if (_AccountTieOutline != null) {
            return _AccountTieOutline!!
        }
        _AccountTieOutline = ImageVector.Builder(
            name = "AccountTieOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.36f, 12.76f)
                curveTo(18.31f, 13.42f, 20f, 14.5f, 20f, 16f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                curveTo(4f, 14.5f, 5.69f, 13.42f, 7.65f, 12.76f)
                lineTo(8.27f, 14f)
                lineTo(8.5f, 14.5f)
                curveTo(7f, 14.96f, 5.9f, 15.62f, 5.9f, 16f)
                verticalLineTo(19.1f)
                horizontalLineTo(10.12f)
                lineTo(11f, 14.03f)
                lineTo(10.06f, 12.15f)
                curveTo(10.68f, 12.08f, 11.33f, 12.03f, 12f, 12.03f)
                curveTo(12.67f, 12.03f, 13.32f, 12.08f, 13.94f, 12.15f)
                lineTo(13f, 14.03f)
                lineTo(13.88f, 19.1f)
                horizontalLineTo(18.1f)
                verticalLineTo(16f)
                curveTo(18.1f, 15.62f, 17f, 14.96f, 15.5f, 14.5f)
                lineTo(15.73f, 14f)
                lineTo(16.36f, 12.76f)
                moveTo(12f, 5f)
                curveTo(10.9f, 5f, 10f, 5.9f, 10f, 7f)
                curveTo(10f, 8.1f, 10.9f, 9f, 12f, 9f)
                curveTo(13.1f, 9f, 14f, 8.1f, 14f, 7f)
                curveTo(14f, 5.9f, 13.1f, 5f, 12f, 5f)
                moveTo(12f, 11f)
                curveTo(9.79f, 11f, 8f, 9.21f, 8f, 7f)
                curveTo(8f, 4.79f, 9.79f, 3f, 12f, 3f)
                curveTo(14.21f, 3f, 16f, 4.79f, 16f, 7f)
                curveTo(16f, 9.21f, 14.21f, 11f, 12f, 11f)
                close()
            }
        }.build()

        return _AccountTieOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountTieOutline: ImageVector? = null
