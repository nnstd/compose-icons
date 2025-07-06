package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanEdit: ImageVector
    get() {
        if (_HumanEdit != null) {
            return _HumanEdit!!
        }
        _HumanEdit = ImageVector.Builder(
            name = "HumanEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.07f, 14.88f)
                lineTo(21.12f, 16.93f)
                lineTo(15.06f, 23f)
                horizontalLineTo(13f)
                verticalLineTo(20.94f)
                lineTo(19.07f, 14.88f)
                moveTo(21.04f, 13.13f)
                curveTo(21.18f, 13.13f, 21.31f, 13.19f, 21.42f, 13.3f)
                lineTo(22.7f, 14.58f)
                curveTo(22.92f, 14.79f, 22.92f, 15.14f, 22.7f, 15.35f)
                lineTo(21.7f, 16.35f)
                lineTo(19.65f, 14.3f)
                lineTo(20.65f, 13.3f)
                curveTo(20.76f, 13.19f, 20.9f, 13.13f, 21.04f, 13.13f)
                moveTo(21f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                lineTo(13f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                moveTo(12f, 2f)
                curveTo(13.1f, 2f, 14f, 2.9f, 14f, 4f)
                curveTo(14f, 5.1f, 13.1f, 6f, 12f, 6f)
                curveTo(10.9f, 6f, 10f, 5.1f, 10f, 4f)
                curveTo(10f, 2.9f, 10.9f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _HumanEdit!!
    }

@Suppress("ObjectPropertyName")
private var _HumanEdit: ImageVector? = null
