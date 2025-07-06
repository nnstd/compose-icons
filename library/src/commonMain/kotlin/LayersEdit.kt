package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LayersEdit: ImageVector
    get() {
        if (_LayersEdit != null) {
            return _LayersEdit!!
        }
        _LayersEdit = ImageVector.Builder(
            name = "LayersEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.63f, 10.27f)
                lineTo(3f, 9f)
                lineTo(12f, 2f)
                lineTo(19.94f, 8.17f)
                lineTo(12.5f, 15.61f)
                lineTo(12f, 16f)
                lineTo(4.63f, 10.27f)
                moveTo(10f, 18.94f)
                verticalLineTo(18.11f)
                lineTo(10.59f, 17.53f)
                lineTo(10.63f, 17.5f)
                lineTo(4.62f, 12.81f)
                lineTo(3f, 14.07f)
                lineTo(10f, 19.5f)
                verticalLineTo(18.94f)
                moveTo(21.7f, 12.58f)
                lineTo(20.42f, 11.3f)
                curveTo(20.21f, 11.09f, 19.86f, 11.09f, 19.65f, 11.3f)
                lineTo(18.65f, 12.3f)
                lineTo(20.7f, 14.35f)
                lineTo(21.7f, 13.35f)
                curveTo(21.91f, 13.14f, 21.91f, 12.79f, 21.7f, 12.58f)
                moveTo(12f, 21f)
                horizontalLineTo(14.06f)
                lineTo(20.11f, 14.93f)
                lineTo(18.06f, 12.88f)
                lineTo(12f, 18.94f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _LayersEdit!!
    }

@Suppress("ObjectPropertyName")
private var _LayersEdit: ImageVector? = null
