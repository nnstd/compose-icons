package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SmartCardOffOutline: ImageVector
    get() {
        if (_SmartCardOffOutline != null) {
            return _SmartCardOffOutline!!
        }
        _SmartCardOffOutline = ImageVector.Builder(
            name = "SmartCardOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 13f)
                horizontalLineTo(16.2f)
                lineTo(15f, 11.8f)
                verticalLineTo(10f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                moveTo(22f, 3f)
                horizontalLineTo(6.2f)
                lineTo(8.2f, 5f)
                horizontalLineTo(22f)
                verticalLineTo(18.8f)
                lineTo(23.5f, 20.29f)
                curveTo(23.79f, 19.94f, 24f, 19.5f, 24f, 19f)
                verticalLineTo(5f)
                curveTo(23.96f, 3.91f, 23.09f, 3.04f, 22f, 3f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.11f, 21f)
                horizontalLineTo(2f)
                curveTo(0.911f, 20.96f, 0.036f, 20.09f, 0f, 19f)
                verticalLineTo(5f)
                curveTo(0.028f, 4.17f, 0.545f, 3.47f, 1.27f, 3.16f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(17.11f, 19f)
                lineTo(14f, 15.89f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(15.75f)
                curveTo(4f, 14.09f, 7.34f, 13.25f, 9f, 13.25f)
                curveTo(9.78f, 13.25f, 10.91f, 13.44f, 11.91f, 13.8f)
                lineTo(9.91f, 11.8f)
                curveTo(9.63f, 11.92f, 9.33f, 12f, 9f, 12f)
                curveTo(7.62f, 12f, 6.5f, 10.88f, 6.5f, 9.5f)
                curveTo(6.5f, 9.17f, 6.58f, 8.87f, 6.7f, 8.59f)
                lineTo(3.11f, 5f)
                horizontalLineTo(2f)
                verticalLineTo(19f)
                horizontalLineTo(17.11f)
                close()
            }
        }.build()

        return _SmartCardOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SmartCardOffOutline: ImageVector? = null
