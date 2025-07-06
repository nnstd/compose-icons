package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeEdit: ImageVector
    get() {
        if (_HomeEdit != null) {
            return _HomeEdit!!
        }
        _HomeEdit = ImageVector.Builder(
            name = "HomeEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                lineTo(2f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(15.11f)
                lineTo(19.43f, 9.68f)
                lineTo(12f, 3f)
                moveTo(21.04f, 11.14f)
                curveTo(20.9f, 11.14f, 20.76f, 11.2f, 20.65f, 11.3f)
                lineTo(19.65f, 12.3f)
                lineTo(21.7f, 14.35f)
                lineTo(22.7f, 13.35f)
                curveTo(22.91f, 13.14f, 22.91f, 12.79f, 22.7f, 12.58f)
                lineTo(21.42f, 11.3f)
                curveTo(21.32f, 11.2f, 21.18f, 11.14f, 21.04f, 11.14f)
                moveTo(19.06f, 12.88f)
                lineTo(13f, 18.94f)
                verticalLineTo(21f)
                horizontalLineTo(15.06f)
                lineTo(21.11f, 14.93f)
                lineTo(19.06f, 12.88f)
                close()
            }
        }.build()

        return _HomeEdit!!
    }

@Suppress("ObjectPropertyName")
private var _HomeEdit: ImageVector? = null
