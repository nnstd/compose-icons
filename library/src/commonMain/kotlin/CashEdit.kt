package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CashEdit: ImageVector
    get() {
        if (_CashEdit != null) {
            return _CashEdit!!
        }
        _CashEdit = ImageVector.Builder(
            name = "CashEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 6f)
                horizontalLineTo(21f)
                verticalLineTo(9.1f)
                curveTo(19.96f, 9.1f, 19.35f, 9.72f, 19.2f, 9.87f)
                lineTo(19.19f, 9.89f)
                lineTo(19f, 10.07f)
                verticalLineTo(10f)
                curveTo(18.47f, 10f, 17.96f, 9.79f, 17.59f, 9.41f)
                curveTo(17.21f, 9.04f, 17f, 8.53f, 17f, 8f)
                horizontalLineTo(7f)
                curveTo(7f, 8.53f, 6.79f, 9.04f, 6.41f, 9.41f)
                curveTo(6.04f, 9.79f, 5.53f, 10f, 5f, 10f)
                verticalLineTo(14f)
                curveTo(5.53f, 14f, 6.04f, 14.21f, 6.41f, 14.59f)
                curveTo(6.79f, 14.96f, 7f, 15.47f, 7f, 16f)
                horizontalLineTo(13.07f)
                lineTo(11.07f, 18f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                moveTo(12f, 9f)
                curveTo(12.8f, 9f, 13.56f, 9.32f, 14.12f, 9.88f)
                curveTo(14.68f, 10.44f, 15f, 11.2f, 15f, 12f)
                curveTo(15f, 12.8f, 14.68f, 13.56f, 14.12f, 14.12f)
                curveTo(13.56f, 14.68f, 12.8f, 15f, 12f, 15f)
                curveTo(11.2f, 15f, 10.44f, 14.68f, 9.88f, 14.12f)
                curveTo(9.32f, 13.56f, 9f, 12.8f, 9f, 12f)
                curveTo(9f, 11.2f, 9.32f, 10.44f, 9.88f, 9.88f)
                curveTo(10.44f, 9.32f, 11.2f, 9f, 12f, 9f)
                moveTo(22.7f, 12.6f)
                lineTo(21.4f, 11.3f)
                curveTo(21.3f, 11.2f, 21.2f, 11.1f, 21f, 11.1f)
                curveTo(20.8f, 11.1f, 20.7f, 11.2f, 20.6f, 11.3f)
                lineTo(19.6f, 12.3f)
                lineTo(21.7f, 14.4f)
                lineTo(22.7f, 13.4f)
                curveTo(22.9f, 13.2f, 22.9f, 12.8f, 22.7f, 12.6f)
                moveTo(15.1f, 21f)
                lineTo(21.1f, 14.9f)
                lineTo(19.1f, 12.8f)
                lineTo(13f, 18.9f)
                verticalLineTo(21f)
                horizontalLineTo(15.1f)
                close()
            }
        }.build()

        return _CashEdit!!
    }

@Suppress("ObjectPropertyName")
private var _CashEdit: ImageVector? = null
