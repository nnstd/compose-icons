package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudTags: ImageVector
    get() {
        if (_CloudTags != null) {
            return _CloudTags!!
        }
        _CloudTags = ImageVector.Builder(
            name = "CloudTags",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.86f, 12.5f)
                curveTo(21.1f, 11.63f, 20.15f, 11.13f, 19f, 11f)
                curveTo(19f, 9.05f, 18.32f, 7.4f, 16.96f, 6.04f)
                curveTo(15.6f, 4.68f, 13.95f, 4f, 12f, 4f)
                curveTo(10.42f, 4f, 9f, 4.47f, 7.75f, 5.43f)
                reflectiveCurveTo(5.67f, 7.62f, 5.25f, 9.15f)
                curveTo(4f, 9.43f, 2.96f, 10.08f, 2.17f, 11.1f)
                reflectiveCurveTo(1f, 13.28f, 1f, 14.58f)
                curveTo(1f, 16.09f, 1.54f, 17.38f, 2.61f, 18.43f)
                curveTo(3.69f, 19.5f, 5f, 20f, 6.5f, 20f)
                horizontalLineTo(18.5f)
                curveTo(19.75f, 20f, 20.81f, 19.56f, 21.69f, 18.69f)
                curveTo(22.56f, 17.81f, 23f, 16.75f, 23f, 15.5f)
                curveTo(23f, 14.35f, 22.62f, 13.35f, 21.86f, 12.5f)
                moveTo(10.5f, 16.18f)
                lineTo(9.09f, 17.6f)
                lineTo(4.5f, 13f)
                lineTo(9.09f, 8.4f)
                lineTo(10.5f, 9.82f)
                lineTo(7.32f, 13f)
                lineTo(10.5f, 16.18f)
                moveTo(14.91f, 17.6f)
                lineTo(13.5f, 16.18f)
                lineTo(16.68f, 13f)
                lineTo(13.5f, 9.82f)
                lineTo(14.91f, 8.4f)
                lineTo(19.5f, 13f)
                lineTo(14.91f, 17.6f)
                close()
            }
        }.build()

        return _CloudTags!!
    }

@Suppress("ObjectPropertyName")
private var _CloudTags: ImageVector? = null
