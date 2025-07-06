package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrainBus: ImageVector
    get() {
        if (_TrainBus != null) {
            return _TrainBus!!
        }
        _TrainBus = ImageVector.Builder(
            name = "TrainBus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 2f)
                horizontalLineTo(12f)
                curveTo(12.8f, 2f, 13.56f, 2.32f, 14.12f, 2.88f)
                curveTo(14.68f, 3.44f, 15f, 4.2f, 15f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                lineTo(5f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                lineTo(5f, 16f)
                curveTo(4.2f, 16f, 3.44f, 15.68f, 2.88f, 15.12f)
                curveTo(2.32f, 14.56f, 2f, 13.8f, 2f, 13f)
                verticalLineTo(5f)
                curveTo(2f, 4.2f, 2.32f, 3.44f, 2.88f, 2.88f)
                curveTo(3.44f, 2.32f, 4.2f, 2f, 5f, 2f)
                moveTo(5.71f, 12.29f)
                curveTo(5.5f, 12.11f, 5.27f, 12f, 5f, 12f)
                curveTo(4.74f, 12f, 4.5f, 12.11f, 4.29f, 12.29f)
                curveTo(4.11f, 12.5f, 4f, 12.74f, 4f, 13f)
                curveTo(4f, 13.27f, 4.11f, 13.5f, 4.29f, 13.71f)
                curveTo(4.5f, 13.9f, 4.74f, 14f, 5f, 14f)
                curveTo(5.27f, 14f, 5.5f, 13.9f, 5.71f, 13.71f)
                curveTo(5.9f, 13.5f, 6f, 13.27f, 6f, 13f)
                curveTo(6f, 12.74f, 5.9f, 12.5f, 5.71f, 12.29f)
                moveTo(11f, 11f)
                curveTo(11f, 9.34f, 12f, 8f, 15f, 8f)
                horizontalLineTo(18f)
                curveTo(21f, 8f, 22f, 9.34f, 22f, 11f)
                verticalLineTo(18f)
                curveTo(22f, 18.74f, 21.6f, 19.39f, 21f, 19.73f)
                verticalLineTo(21f)
                curveTo(21f, 21.55f, 20.55f, 22f, 20f, 22f)
                curveTo(19.45f, 22f, 19f, 21.55f, 19f, 21f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(21f)
                curveTo(14f, 21.55f, 13.55f, 22f, 13f, 22f)
                curveTo(12.45f, 22f, 12f, 21.55f, 12f, 21f)
                verticalLineTo(19.73f)
                curveTo(11.4f, 19.39f, 11f, 18.74f, 11f, 18f)
                verticalLineTo(11f)
                moveTo(13f, 10f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                moveTo(14f, 18f)
                curveTo(14.55f, 18f, 15f, 17.55f, 15f, 17f)
                curveTo(15f, 16.45f, 14.55f, 16f, 14f, 16f)
                curveTo(13.45f, 16f, 13f, 16.45f, 13f, 17f)
                curveTo(13f, 17.55f, 13.45f, 18f, 14f, 18f)
                moveTo(20f, 17f)
                curveTo(20f, 16.45f, 19.55f, 16f, 19f, 16f)
                curveTo(18.45f, 16f, 18f, 16.45f, 18f, 17f)
                curveTo(18f, 17.55f, 18.45f, 18f, 19f, 18f)
                curveTo(19.55f, 18f, 20f, 17.55f, 20f, 17f)
                close()
            }
        }.build()

        return _TrainBus!!
    }

@Suppress("ObjectPropertyName")
private var _TrainBus: ImageVector? = null
